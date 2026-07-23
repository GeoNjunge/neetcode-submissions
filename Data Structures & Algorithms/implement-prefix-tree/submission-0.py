class PrefixTree:

    def __init__(self):
        self.list = []
        

    def insert(self, word: str) -> None:
        self.list.append(word)
        return None


    def search(self, word: str) -> bool:
        if word in self.list:
            return True

        return False
        

    def startsWith(self, prefix: str) -> bool:
        for word in self.list:
            if word.startswith(prefix):
                return True

        return False
        